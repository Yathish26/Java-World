import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class JsonServer {
    public static void main(String[] args) throws Exception {
        // Create an HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        System.out.println("Server is starting on http://localhost:8080");
        
        // Define a context that listens for "/data" path
        server.createContext("/data", new JsonHandler());
        
        // Start the server
        server.setExecutor(null); // Use the default executor
        server.start();
    }
}

class JsonHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) {
        try {
            // Set response headers
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            
            // JSON response data
            String jsonResponse = """
                {
                    "name": "Yathish Acharya",
                    "age": 24,
                    "place":"Mangalore"
                }
            """;

            // Send response
            exchange.sendResponseHeaders(200, jsonResponse.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(jsonResponse.getBytes());
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
