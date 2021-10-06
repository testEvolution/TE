@Test
    public void testHashCode() {
        RelativeDateFormat df1 = new RelativeDateFormat(123L);
        RelativeDateFormat df2 = new RelativeDateFormat(123L);
        assertTrue(df1.equals(df2));
        int h1 = df1.hashCode();
        int h2 = df2.hashCode();
        assertEquals(h1, h2);
    }

    