@Test
    public void testFormat() {
        RelativeDateFormat rdf = new RelativeDateFormat();
        String s = rdf.format(new Date(2 * 60L * 60L * 1000L + 122500L));
        assertEquals("2h2m2.500s", s);
    }

    