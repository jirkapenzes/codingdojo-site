(ns codingdojo-site.dojos)

(def dojos
  { :prague {
             :name "Coding Dojo Prague"
             :repository "https://github.com/codingdojoprague/coding-dojo"
             :events "http://srazy.info/coding-dojo-prague/terminy"
             :organizers [
                          ["@jirkapenzes" "http://twitter.com/jirkapenzes"]
                          ["@alesroubicek" "http://twitter.com/alesroubicek"]
                          ["@MarianSchubert" "https://twitter.com/marianschubert"]
                          ["@matejhron" "http://twitter.com/matejhron"]] }

    :gmcolomouc {
                 :name "GMC Coding Dojo"
                 :events "http://srazy.info/gmc-coding-dojo/terminy"
                 :repository "https://bitbucket.org/mcBIG/gmc-coding-dojo"
                 :organizers [
                              ["@mcBigCz" "https://twitter.com/mcBIGcz"]
                              ["@TomasLatal" "https://twitter.com/TomasLatal"]]}

    :pardubice {
                :name "GDG Coding Dojo Pardubice"
                :repository "https://github.com/CodingDojoPardubice/CodingDojo"
                :events "https://www.meetup.com/GDG-Pardubice/"
                :organizers [
                             ["@EmilRezanina" "https://twitter.com/EmilRezanina"]
                             ["@JanVoracek" "https://twitter.com/JanVoracek"]]}

    :jihlava {
              :name "GDG Coding Dojo Jihlava"
              :events "http://www.gug.cz/cs/akce/gdg-coding-dojo-jihlava"
              :repository "https://github.com/GDGJihlava/gdg-coding-dojo-jihlava"
              :organizers [
                           ["@milanlempera" "https://twitter.com/milanlempera"]
                           ["@GDGJihlava" "https://twitter.com/GDGJihlava"]]}

    :budejovice {
                :name "GDG Coding Dojo České Budějovice"
                :events "http://www.gug.cz/cs/akce/coding-dojo-cb/"
                :repository "https://github.com/GDGCB/coding-dojo"
                :organizers [
                             ["@hlavacm" "https://twitter.com/hlavacm"]
                             ["@GDGBudejovice" "https://twitter.com/GDGBudejovice"]]}

    :brno {
                :name "GDG Coding Dojo Brno"
                :events "http://www.gug.cz/cs/akce/gdg-coding-dojo-brno/"
                :repository "https://github.com/GDGBrno/coding-dojo"
                :organizers [
                             ["@GDGBrno" "https://twitter.com/GDGBrno"]
                             ["@VitaPlsek" "https://twitter.com/VitaPlsek"]
                             ["@horakmat" "https://twitter.com/horakmat"]]}})

(defn all [] dojos)
