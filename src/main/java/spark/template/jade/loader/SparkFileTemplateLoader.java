package spark.template.jade.loader;

import de.neuland.jade4j.template.FileTemplateLoader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by hieuln on 12/05/16.
 */
public class SparkFileTemplateLoader extends FileTemplateLoader {
    private String templateRoot;

    /**
     * Construct a file loader using the given template root.
     *
     * @param templateRoot the template root directory
     */
    public SparkFileTemplateLoader(String templateRoot) {
        super("", "UTF-8");
        if (!templateRoot.endsWith(File.separator)) {
            templateRoot += File.separator;
        }
        this.templateRoot = templateRoot;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reader getReader(String name) throws IOException {
        return super.getReader(templateRoot + name);
    }
}
