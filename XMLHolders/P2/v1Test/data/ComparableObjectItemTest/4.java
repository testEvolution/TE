@Test
    public void testCompareTo() {
        ComparableObjectItem item1 = new ComparableObjectItem(1, "XYZ");
        ComparableObjectItem item2 = new ComparableObjectItem(2, "XYZ");
        ComparableObjectItem item3 = new ComparableObjectItem(3, "XYZ");
        ComparableObjectItem item4 = new ComparableObjectItem(1, "XYZ");
        assertTrue(item2.compareTo(item1) > 0);
        assertTrue(item3.compareTo(item1) > 0);
        assertTrue(item4.compareTo(item1) == 0);
        assertTrue(item1.compareTo(item2) < 0);
    }

}