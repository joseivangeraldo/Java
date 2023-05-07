#!/bin/bash

HORA=$(date +%H)
MIN=$(date +%M)

$(git add .)
sleep 3
$(git commit -a -m "Alterado $(date +%Y%m%d%H%M)")
sleep 3
$(git push)