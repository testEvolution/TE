@Test
    public void testSerialization() {
        LevelRenderer r1 = new LevelRenderer();
        LevelRenderer r2 = (LevelRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    