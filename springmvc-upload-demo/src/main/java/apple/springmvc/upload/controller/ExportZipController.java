package apple.springmvc.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-05 23:41
 */
@Controller
@RequestMapping("/export")
public class ExportZipController {

    private File dir = new File("D:/temp");

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download(@RequestParam("filename") String fileName, HttpServletRequest request,
                           HttpServletResponse response) throws IOException {


        return "success";
    }
}
