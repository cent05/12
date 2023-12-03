const http = require('http');

http.createServer(function(req,res){
    res.writeHead(200,{'content-type':'text/html'});
    res.write("Server Created");
    console.log("Server Created");
    res.end();
}).listen(8080);

console.log("Server Started");