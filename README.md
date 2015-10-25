Source code of the example used in my LinuxDay 2015 talk.

To get the mutation coverage report run:

    $ mvn clean install
    $ mvn org.pitest:pitest-maven:mutationCoverage site

Then open in a browser the report at:

    /site/index.html

