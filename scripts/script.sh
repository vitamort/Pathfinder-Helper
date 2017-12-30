#!/bin/bash
pushd server
#mvn install jacoco:report coveralls:report --settings=../config/settings.xml -Ptravis-build -B
mvn install --settings=../config/settings.xml -Ptravis-build -B
popd
