@Test
    public void testSerialization() {
        BoxAndWhiskerRenderer r1 = new BoxAndWhiskerRenderer();
        BoxAndWhiskerRenderer r2 = (BoxAndWhiskerRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    