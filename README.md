### Application
This application is intended for accounting and control of planets by lords
### Technologies
- Java 11
- Spring  (Boot, MVC, Data)
- PostgreSQL

### REST API

 endpoint:

| URI                                 | Method     | Description                            |
| ---------------------               | ----       | ------------------------               |
|*/lords*                            | **GET**    | Get  all lords by director             | 
|*/planets*                            | **GET**    | Get  all planets by director             | 
|*/lords*                           | **POST**   | Add new lord                           | 
|*/planets*                           | **POST**   | Add new planets                          | 
|*/lords/{lordId}*                     | **GET**    | Get lord by id                      |
|*/planets/{planetId}*                     | **GET**    | Get planet by id                      |
|*/planets/{planetId}*                 | **DELETE** | Delete planet by id                      |
|*/lords/{lordId}/add-planet/{planetId}*| **POST**   | Appoint a lord to rule the planet     | 
|*/lords/withPlanetsCount?planetCount={0} | **GET**    |Get lords by the number of controlled planets                  | 
|*/lords/topSorted?sortBy={age}&limit={10}*| **GET** | Get lords sorted and limited | 
 
