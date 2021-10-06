@Test
    public void testSerialization() {
        CategoryStepRenderer r1 = new CategoryStepRenderer();
        CategoryStepRenderer r2 = (CategoryStepRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    