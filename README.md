# DokerImages
this rep contain java and python basic docker image and file


All the commands that I use during the process 

docker -v    //check the version 

docker pull <imageName> // to pull the image

docker images // to know about the images

docker ps || docker ps -a  // to know the current images running in the background 

docker search <imageName> // to search the images

Docker pull <imageName>:version  ===> Docker pull openjdk:18

docker rmi <docker image name or id> // to remove the image 

docker build -t <name of the build> . // to build the image you created

docker run --name <give image a name> <image id> // to run the images you build

docker run --name <give image a name> -d <image id> // to run the images in background

docker images // to see the images 




