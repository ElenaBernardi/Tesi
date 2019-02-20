#!/usr/bin/env bash
echo Starting restaurant-service...
docker start restaurant-service
echo Starting postgres-restaurant
docker start postgres-restaurant