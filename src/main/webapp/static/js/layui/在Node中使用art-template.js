/**
 * Created by Huan on 2019/4/12.
 */
var template=require('art-template ')

var http=require('http')
var fs=require('fs')

http
    .createServer(function(req,res){
        var url=req.url;//�����ַ���еĵ�ַ������������͹���
        if(url==='/'){
            fs.readFile('')
        }
    })
.listen(3000,function(){
        console.log('runing...')
    })