# crud-springboot-docker

Comandos Docker:

para iniciar um container que ja existe.(que contenha images)
 docker start NOME_CONTAINER (teste2)
ou docker stop e nome do servidor(teste2)
--------------------------------------------------------------
comando para ver as imagens no container
docker images
--------------------------------------------------------------
Renomear container
docker rename adoring_ardinghelli servidor-teste
----------------------------------------------------------------
Para Remover container
docker rm nome do container ou Id (após para o container) senão docker rm -f (para forçar)
----------------------------------------------------------------
Para Remover imagem
docker rmi e o Id da imagem
--------------------------------------------------------------
comando para visualizar o status do container
docker ps -a 
---------------------------------------------------------------
comando para entrar no container
docker attach nome do container ou Id
---------------------------------------------------------------
comando para ver os logs do container
docker container logs "nome do container" 
---------------------------------------------------------------
comando para sair do container
exit
-------------------------------------------------------------------
comando para mostrar atualizações ou tudo que foi mudado no container
docker diff nome do container ou Id
----------------------------------------------------------------------------
-------------------------comando para criar container--------------------------
docker run --name mybanco -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql
-----------------------------------------------------------------------------
docker exec -it "nome do container" mysql -p
docker run -it "nome do container" mysql -p
------------------------------------------------------------------------------------
docker-compose up --build --force-recreate
------------------------------postgres------------------------------------------
docker exec -it postgres-0 bash
psql -U postgres
\du -> para super usuario
psql -h localhost -p 5432 -U postgres
---------------------------------------------------------------------------------
//comando que para todos os serviços do docker
docker system prune 

-----------------------------procedimento para criar uma imagem atacha ao banco-------------------------------------

// Comando para renomear e direcionar a porta na imagem mysql (já baixada) ao criar o container - caso não tenha (docker pull mysql)
docker run -p 3308:3306 --name db -e MYSQL_ROOT_PASSOWRD=root -e MYSQL_DATABASE=teste45 mysql

//comando para criar imagem 
docker build -t app .

//Comando para criar uma network(rede) personalizada
 docker network create spring-network

//Comando para conectar a rede ao banco
docker network connect spring-network db

//Comando para listar as networks ou docker network COMMAND
docker network ls 

//Comando para inspecionar o container
docker container inspect db

//comando para rodar a aplicação na mesma rede que mysql
docker run -p 9090:8080 --name app --net segundo-network -e MYSQL_HOST=db -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 app  


------------------como enviar docker images para o dockerhub --------------------------------------------

https://www.youtube.com/watch?v=x1PlJRYIr0I

docker run --name containerPostgres -e POSTGRES_PASSWORD=admin123 -p 5432:5433 -d postgres

//Comando para criar um container do sqlServer
docker run --name outra -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=music@25" -p 1433:1433 -d mcr.microsoft.com/mssql/server:2017-latest