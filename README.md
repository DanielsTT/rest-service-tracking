# rest-service-tracking
This repository includes a basic REST service built with Spring framework.

### Run MySQL database
```bash
docker run -p 3307:3306 --name restservicetracking -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=restservicetracking --rm -d mysql
```
## Swagger UI
```cmd
http://localhost:8080/swagger-ui/index.html
```

## Endpoints

### Create event
```
POST http://localhost:8080/tracking/event
```
```json
{
	"ipAddress": "127.0.0.1",
	"requestMethod": "POST",
	"requestUri": "http://localhost:8080/tracking/event",
	"user": "admin@example.com",
	"requestTimestamp": "2023-01-17 10:02:01"
}
```
### Get all logs
```
GET http://localhost:8080/tracking/logs
```