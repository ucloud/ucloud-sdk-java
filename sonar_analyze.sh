#!/bin/bash
mvn compile sonar:sonar -Dsonar.host.url=$SONAR_HOST -Dsonar.login=$SONAR_TOKEN -Dsonar.issuesReport.html.enable=true -Dsonar.projectKey=$CI_PROJECT_PATH_SLUG -Dsonar.gitlab.project_id=$CI_PROJECT_ID -Dsonar.gitlab.commit_sha=$CI_COMMIT_SHA -Dsonar.gitlab.ref_name=$CI_COMMIT_REF_NAME

if [ $? -eq 0 ]; then
    echo "sonarqube code-analyze over."
fi