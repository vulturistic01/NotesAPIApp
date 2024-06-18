# NotesAPIApp

After cloning the repo, you need to run the main method, once running, you could use postman to access the API. 
GET http://localhost:8080/notes - to get all notes 
GET http://localhost:8080/notes/1 - to get notes by id
DELETE http://localhost:8080/notes/1
PUT http://localhost:8080/notes/1 - to update note
PUT http://localhost:8080/notes - create notes 
{"title": "Disconnection notice", "body": "This is a disconnection notice."}

You could also use curl if you don't have postman 

Create Note:
curl -X POST http://localhost:8080/notes -H "Content-Type: application/json" -d '{"title": "Note 1", "body": "This is the first note"}'
Delete Note:
curl -X DELETE http://localhost:8080/notes/1
Update specific Note:
curl -X PUT http://localhost:8080/notes/1 -H "Content-Type: application/json" -d '{"title": "Updated Note", "body": "This is the updated note"}'
Get all Notes:
curl http://localhost:8080/notes
Get Notes by ID: 
curl http://localhost:8080/notes/1
