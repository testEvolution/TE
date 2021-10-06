@Test
    public void testGenerateURLFragment() {
        StandardURLTagFragmentGenerator g
                = new StandardURLTagFragmentGenerator();
        assertEquals(" href=\"abc\"", g.generateURLFragment("abc"));
        assertEquals(" href=\"images/abc.png\"",
                g.generateURLFragment("images/abc.png"));
        assertEquals(" href=\"http://www.jfree.org/images/abc.png\"",
                g.generateURLFragment("http://www.jfree.org/images/abc.png"));
    }

}