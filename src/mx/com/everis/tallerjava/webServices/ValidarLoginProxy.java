package mx.com.everis.tallerjava.webServices;

public class ValidarLoginProxy implements mx.com.everis.tallerjava.webServices.ValidarLogin {
  private String _endpoint = null;
  private mx.com.everis.tallerjava.webServices.ValidarLogin validarLogin = null;
  
  public ValidarLoginProxy() {
    _initValidarLoginProxy();
  }
  
  public ValidarLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initValidarLoginProxy();
  }
  
  private void _initValidarLoginProxy() {
    try {
      validarLogin = (new mx.com.everis.tallerjava.webServices.ValidarLoginServiceLocator()).getValidarLoginPort();
      if (validarLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)validarLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)validarLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (validarLogin != null)
      ((javax.xml.rpc.Stub)validarLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.everis.tallerjava.webServices.ValidarLogin getValidarLogin() {
    if (validarLogin == null)
      _initValidarLoginProxy();
    return validarLogin;
  }
  
  public java.lang.String validarLogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (validarLogin == null)
      _initValidarLoginProxy();
    return validarLogin.validarLogin(arg0, arg1);
  }
  
  
}