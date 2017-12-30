#!/bin/bash
pushd server
mvn --settings=../config/settings.xml -Ptravis-build -B \
    install jacoco:report \
    coveralls:report -DrepoToken=${REPOTOKEN}
popd
