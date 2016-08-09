#!/bin/bash
mvn clean prepare-agent
mvn verify
mvn  -Dsonar.host.url=http://localhost:9000/  sonar:sonar
