var http = require('http');
var formidable = require('formidable');
var fs = require('fs');

http.createServer(function(error,req,res){
	if(error){
		return console.error(error);
	}
	else{
		if(req.url == '/fileupload'){
			var form = new formidable.IncomingForm();
			form.parse(req, function(err,fields,files){
				var oldpath = files.filetoupload.path;
				var newpath = 'C:\Users\Mahreen-PC\Desktop\NodeJS Programs\P7\Uploaded File' + files.filetoupload.name;
				fs.rename(oldpath,newpath,function(error){
					if(error){
						return console.error(error);
					}
					else{
						res.write('File uploaded and moved successfully!');
					}
				res.end();
				});
			});
		}
		else{
			res.writeHead(200,{'Content-Type': 'text/html'});
			res.write('<form action = "fileupload" method = "post" enctype = "multipart/form-data">');
			res.write('<input type = "file" name = "fileupload"><br>');
			res.write('<input type = "submit">');
			res.write('</form>');
			return res.end();
		}
	}
}).listen(8080);