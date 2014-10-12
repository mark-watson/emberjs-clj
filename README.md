# emberjs-clj

Mark Watson March 11, 2013.

## History

Updated 2014/10/12: removed the use of the old noir library and made this a straight-up compojure app. I also changed the JavaScript Ember.js application to remove two deprecation warnings.

Updated 2014/9/33: updated to Ember.js 1.7.0 and Clojure 1.6. TBD: Using noir - should convert to straight up compujure app.

Updated 2013/12/23: updated to Ember.js 1.2.0

A simple Ember.js and Clojure web app template - a minimal example of making a REST call from Ember.js back to Clojure.

I plan on using Ember.js for web app front ends with Clojure + Compojure + Noir backend services. This project is intended as a short template project to start real web apps with.
Credits:

I read the book by Marc Bodmer "Instant Ember.js Application Development How-to":

http://www.packtpub.com/emberjs-application-development/book

before working through this example, and I used Marc's suggested setup for Ember.js projects.

# How to run

I use lein 2.x:

lein deps

lein run

Then hit the URI:  http://localhost:6066/index.html


