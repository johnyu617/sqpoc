#!/bin/bash
mvn  clean jacoco:prepare-agent
mvn verify
mvn sonar:sonar -Dsonar.host.url=http://43.138.14.28:9000 -Dsonar.branch=ken1 -Dsonar.login=admin -Dsonar.password=admin123
