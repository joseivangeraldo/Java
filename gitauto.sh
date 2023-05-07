#!/bin/bash
NOW="$(date +"%m-%d-%Y")"

$(git add .)
sleep 3
if [ $? -eq 0 ] ; then
    echo "Added to git"
else
    # do some repair actions or bail-out with
    echo "ERROR NESTA PARTE"
    exit 1
fi
$(git commit -a -m "Alterado $NOW")
sleep 3
$(git push)