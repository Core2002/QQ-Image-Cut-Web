<h1 align="center">✂️ QQ Image Cut - Web</h1>
<h5 align="center">Web 版的QQ精选照片切割器</h5>

------

工作原理和介绍请参见 [Node.js版本](https://github.com/Core2002/QQ-Image-Cut)  

# 部署方法(Debian)
1. `apt update && apt install openjdk-17-jdk git maven screen -y`
2. `git clone https://github.com/Core2002/QQ-Image-Cut-Web.git`
3. `mv QQ-Image-Cut-Web .QQ-Image-Cut-Web && cd .QQ-Image-Cut-Web && mvn package`
4. `crontab -e` 编辑crontab文件，添加以下内容：  
   `@reboot screen -dmS ImageCut java -jar /root/.QQ-Image-Cut-Web/target/ImageCut-0.0.1-SNAPSHOT.jar --server.port=2333`
5. `screen -dmS ImageCut java -jar /root/.QQ-Image-Cut-Web/target/ImageCut-0.0.1-SNAPSHOT.jar --server.port=2333`

