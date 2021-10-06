@Test
    public void testSerialization() {
        KeyedObjects ko1 = new KeyedObjects();
        ko1.addObject("Key 1", "Object 1");
        ko1.addObject("Key 2", null);
        ko1.addObject("Key 3", "Object 2");
        KeyedObjects ko2 = (KeyedObjects) TestUtils.serialised(ko1);
        assertEquals(ko1, ko2);
    }

    