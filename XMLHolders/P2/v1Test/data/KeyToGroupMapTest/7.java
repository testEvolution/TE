@Test
    public void testSerialization() {
        KeyToGroupMap m1 = new KeyToGroupMap("Test");
        KeyToGroupMap m2 = (KeyToGroupMap) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

}