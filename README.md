# rest-service-tracking

### Run database
```bash
docker run -p 3307:3306 --name restservicetracking -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=restservicetracking --rm -d mysql
```