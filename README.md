# terminate-demo
Demo of how the application terminates

Build Docker Image:
docker build . -t terminate-demo 

Shut down application:
curl http://localhost:8080/shutdown -X POST 
