#!/bin/sh
git filter-branch --force --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch ucloud-sdk-generator-1.0-SNAPSHOT.jar' --tag-name-filter cat --
git filter-branch --force --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch sonar_analyze.sh' --tag-name-filter cat --
git filter-branch --force --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch template' --tag-name-filter cat --
git filter-branch --force --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch clean.sh' --tag-name-filter cat --
git filter-branch --force --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch .gitlab-ci.yml' --tag-name-filter cat --
