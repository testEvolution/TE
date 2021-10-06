@Test
    public void testHashCode() {
        MyComparableObjectSeries s1 = new MyComparableObjectSeries("Test");
        MyComparableObjectSeries s2 = new MyComparableObjectSeries("Test");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add("A", "1");
        s2.add("A", "1");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add("B", null);
        s2.add("B", null);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add("C", "3");
        s2.add("C", "3");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add("D", "4");
        s2.add("D", "4");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

}