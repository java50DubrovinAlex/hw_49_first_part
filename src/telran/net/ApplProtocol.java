package telran.net;

public interface ApplProtocol {
Response getResponse(Request request) throws ClassNotFoundException, NoSuchMethodException, SecurityException;
}
