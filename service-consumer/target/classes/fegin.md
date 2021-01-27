# Fegin性能优化
## gzip压缩
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
gzip是一种数据格式，采用deflate算法压缩数据，gzip是一种流行的压缩算法，
当压缩一个文本文件时，能节省70%以上的文件大小。
<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
作用:降低网络传输的数据，加快网页加载的速度。从http的header中的response
中有一个content-type:gzip表示，如下图：
![img.png](img.png)

## http中关于压缩传输的规定
1. 客户端向服务器请求中带有：Accept-Encoding:gzip, deflate字段，
向服务器表示客户端支持的压缩格式（gzip deflate)，如果不发送该消息头，服务端默认是不会压缩的
2. 服务端在收到请求后，如果发现请求头中含有Accept—Encoding字段，并且支持该类型压缩，就会对
响应报文压缩之后返回给客户端，并且携带Content-Encoding:gzip消息头，表示响应报文是根据该格式
进行压缩的
3.客户端接收到请求之后，先判断是否有Content-Encoding消息头，如果有，请按该格式解压报文，否则
按正常解压   
   