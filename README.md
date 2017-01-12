# 環境
- java1.8

# url
https://localhost:8444/skel-servlet/SampleServlet

# ssl環境
## key作成
keytool -genkey -alias tomcat -keyalg RSA -keystore /usr/local/Cellar/tomcat/8.0.9/libexec/conf/keystore.jks

## tomcat server.xml
<pre>
&lt;Connector port="8444" protocol="HTTP/1.1" SSLEnabled="true" maxThreads="150" scheme="https" secure="true" clientAuth="false" sslProtocol="TLS" keystoreFile="/usr/local/Cellar/tomcat/8.0.9/libexec/conf/keystore.jks" keystorePass="passwd" /&gt;
</pre>
