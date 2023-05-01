
<p align = "center"> <img src = "https://stytch.com/blog/wp-content/uploads/2022/01/How-a-refresh-token-is-generated-and-used-1.png" /> </p>
<h1>Implementación de autenticación con JWT utilizando refresh tokens</h1>
<p>Los <b>refresh tokens</b> son una herramienta esencial para garantizar tanto la seguridad como la comodidad de los usuarios al utilizar aplicaciones que requieren autenticación y autorización. Normalmente, los tokens de acceso tienen una duración limitada (por ejemplo, 1 hora) para evitar que un posible atacante acceda a recursos protegidos con un token robado durante un período prolongado de tiempo.
<br><br>
Con el uso de refresh tokens, el usuario puede solicitar un nuevo token de acceso sin tener que ingresar sus credenciales nuevamente, lo que mejora la experiencia del usuario y evita la frustración de tener que volver a iniciar sesión en la aplicación cada vez que el token de acceso expira. Además, el uso de refresh tokens aumenta la seguridad de la aplicación, ya que reduce la ventana de oportunidad para posibles ataques durante el tiempo en que el usuario está inactivo en la aplicación.<p>
<br />
<h2>Funcionalidades:</h2>

- Registro de usuario y login con JWT authentication
- Encriptación de contraseña utilizando BCrypt
- Autorización basada en roles con Spring Security
- Mecanismo de cierre de sesión
- Refresh token
<br />
<h2>Tecnologías:</h2>

- Frameworks: Spring Boot 2.7.11, Spring Security 2.7.1, JPA y Hibernate
- Seguridad: JSON Web Tokens (JWT) con la biblioteca "java-jwt" de Auth0, BCrypt
- Manejo de dependencias: Maven
- Base de datos: MySQL
<br />
<h2>Cómo ejecutarlo:</h2>

Requerimientos: Primero necesitarás instalar lo siguiente:

- JDK 11+
- MySQL workbench

<p>Además, debes configurar las siguientes variables de entorno en tu sistema o en el archivo <code>application.yml</code>:</p>

- <code>DB_USERNAME</code>: nombre de usuario de la base de datos.
- <code>DB_PASSWORD</code>: contraseña del usuario de la base de datos.
- <code>ACCESS_SECRET</code>: clave secreta de más de 256 bits para generar y verificar los tokens de acceso.
- <code>ACCESS_EXPIRATION</code>: tiempo de expiración en horas del token de acceso.
- <code>REFRESH_SECRET</code>: clave secreta de más de 256 bits para generar y verificar los tokens de actualización.
- <code>REFRESH_EXPIRATION</code>: tiempo de expiración en horas del token de actualización.

Una vez cumplidos estos pasos, puedes clonar el proyecto y ejecutarlo en tu IDE preferido.
