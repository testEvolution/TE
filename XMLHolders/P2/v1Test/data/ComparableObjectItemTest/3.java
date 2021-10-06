@Test
    public void testSerialization() {
        ComparableObjectItem item1 = new ComparableObjectItem(1, "XYZ");
        ComparableObjectItem item2 = (ComparableObjectItem) 
                TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

    