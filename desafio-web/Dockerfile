FROM node:8.9.4 AS build
MAINTAINER Marcos Alves
WORKDIR /app
COPY package*.json ./
RUN npm install
RUN npm install -g typescript
RUN npm install -g @angular/cli
COPY . .
RUN ng build --prod

### INSTALACAO DO NGINX
FROM nginx
COPY --from=build /app/dist/desafio-web /usr/share/nginx/html
EXPOSE 80