#!/bin/bash

DATA =$(date +%Y%d%m%H%M)

$(git add .)
sleep 3
$(git commit -a -m "Alterado $DATA")
sleep 3
$(git push)