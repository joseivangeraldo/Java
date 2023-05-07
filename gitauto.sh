#!/bin/bash

HORA=$(date +%H)

MIN=$(date +%M)

$(git add .)
sleep 3
$(git commit -a -m 'Alterado $HORA:$MIN')
sleep 3
$(git push)