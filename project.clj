(defproject org.clojars.adamwynne/postal "1.8-SNAPSHOT"
  :repositories {"java.net" "http://download.java.net/maven/2"}
  :plugins [[lein-clojars "0.7.0"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [javax.mail/mail "1.4.4"
                  :exclusions [javax.activation/activation]]])
