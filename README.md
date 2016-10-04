This example is based on the following resources:

 - http://projects.spring.io/spring-security-oauth/docs/oauth2.html
 - https://github.com/spring-guides/tut-spring-boot-oauth2/
 - https://github.com/spring-guides/tut-spring-security-and-angular-js/tree/master/oauth2



How to test:

1. $ `cd authorization-server;mvn spring-boot:run`
2. $ `cd resource-server;mvn spring-boot:run`

3. Obtain token with: $ `curl resource-server:resource-server-secret@localhost:8080/oauth/token -d grant_type=client_credentials`
4. Check the user endpoint with: $ `curl -H "Authorization: Bearer d1aeef2e-08b2-4d06-b665-1534ac2641b6" -v localhost:8080/user`
5. Should be possible to access the resource with: $ `curl curl -H "Authorization: Bearer d1aeef2e-08b2-4d06-b665-1534ac2641b6" -v localhost:9090`