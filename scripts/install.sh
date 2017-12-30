#!/bin/bash
pushd server
mvn install --settings=../config/settings.xml -Pinstall -B > /dev/null 2>&1
popd
