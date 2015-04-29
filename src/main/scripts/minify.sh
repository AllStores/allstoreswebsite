# java -jar ../resources/yuicompressor-2.4.7.jar ../webapp/static/js/script.js -o ../webapp/static/js/script-min.js 
# java -jar ../resources/yuicompressor-2.4.7.jar ../webapp/static/js/script-second.js -o ../webapp/static/js/script-second-min.js 

cat ../webapp/static/js/jquery-1.9.1.min.js ../webapp/static/js/script.js ../webapp/static/js/script-second.js | java -jar ../resources/yuicompressor-2.4.7.jar --type js -o ../webapp/static/js/all-js-min.js 

cat ../webapp/static/js/jquery-1.9.1.min.js ../webapp/static/js/script.js  | java -jar ../resources/yuicompressor-2.4.7.jar --type js -o  ../webapp/static/js/scr-main-jq-js-min.js

java -jar ../resources/yuicompressor-2.4.7.jar ../webapp/static/css/normalize.css -o ../webapp/static/css/style-nor-min.css 
java -jar ../resources/yuicompressor-2.4.7.jar ../webapp/static/css/style.css >> ../webapp/static/css/style-nor-min.css

 

