@Test
    public void testSerialization() {
        KeyedObject ko1 = new KeyedObject("Test", "Object");
        KeyedObject ko2 = (KeyedObject) TestUtils.serialised(ko1);
        assertEquals(ko1, ko2);
    }

}