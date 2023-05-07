#!/bin/bash
NOW="$(date +"%m-%d-%Y")"

$(git add .)
sleep 3
$(git commit -a -m "Alterado $NOW")
sleep 3
$(git push)