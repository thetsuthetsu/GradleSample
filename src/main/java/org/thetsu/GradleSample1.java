package org.thetsu;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class GradleSample1 {
    @Option(name = "-f")
    public String hoge;

    public void run() {
        System.out.println(hoge);
    }


    public static void main(String[] args) {
        System.out.println("GradleSample1-----");
        GradleSample1 sample1 = new GradleSample1();
        CmdLineParser cmdLineParser = new CmdLineParser(sample1);

        try {
            cmdLineParser.parseArgument(args);
            sample1.run();
        } catch (CmdLineException e) {
            e.printStackTrace();
        }

    }
}
