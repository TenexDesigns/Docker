Docker images and containers are two distinct concepts. An image is a read-only template that contains the application code, libraries, dependencies, tools, and other files needed for an application to run ¹⁴. A container is a runtime instance of an image that gets created when the `docker run` command is implemented ¹⁴. You can have many running containers of the same image ¹⁴.

To create a Docker image, you need to write a Dockerfile that specifies the instructions to build the image. Once you have written the Dockerfile, you can build the image using the `docker build` command [^20^]. Here is an example of how to create an image:

```
# Dockerfile
FROM python:3.9
WORKDIR /app
COPY . /app
RUN pip install -r requirements.txt
CMD ["python", "app.py"]
```

```
# Build the image
docker build -t my-image .
```

Once you have built an image, you can create a container from it using the `docker run` command ⁸. The `docker run` command creates a new container of an image and executes it ⁸. If you want to start a container that has already been created but has stopped running, you can use the `docker start` command ⁸.

Images and containers are immutable by default. Once an image or container is created, it cannot be changed. If you need to make changes to an image or container, you need to create a new one ¹⁴. However, Docker provides volumes and bind mounts as mechanisms for persisting data in your Docker container ⁴.

Deleting an image does not delete its corresponding containers. However, if you delete an image that a container was created from, you will not be able to create new containers from that image again unless you rebuild it or pull it from a registry again [^10^].

I hope this helps!
