@Test
    public void testGenerateURLFragment() {
        OverLIBToolTipTagFragmentGenerator g
                = new OverLIBToolTipTagFragmentGenerator();
        assertEquals(" onMouseOver=\"return overlib('abc');\""
                + " onMouseOut=\"return nd();\"",
                g.generateToolTipFragment("abc"));
        assertEquals(" onMouseOver=\"return overlib("
                + "'It\\'s \\\"A\\\", 100.0');\" onMouseOut=\"return nd();\"",
                g.generateToolTipFragment("It\'s \"A\", 100.0"));
    }

}